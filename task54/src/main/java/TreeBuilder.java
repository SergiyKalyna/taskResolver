import java.util.*;

public class TreeBuilder {
    private int[] values;
    private Color[] colors;
    private final Map<Integer, Set<Integer>> nodesMap = new HashMap<>();

    public Tree createTree() {
        Scanner in = new Scanner(System.in);
        int nodes = in.nextInt();

        values = new int[nodes];
        for (int i = 0; i < nodes; i++) {
            values[i] = in.nextInt();
        }

        colors = new Color[nodes];
        for (int i = 0; i < nodes; i++) {
            colors[i] = (in.nextInt() == 0) ? Color.RED : Color.GREEN;
        }

        Tree rootNode;
        if (nodes == 1) {
            rootNode = new TreeLeaf(values[0], colors[0], 0);
        } else {
            rootNode = new TreeNode(values[0], colors[0], 0);

            for (int i = 0; i < (nodes - 1); i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                Set<Integer> uEdges = nodesMap.get(u);

                if (uEdges == null) {
                    uEdges = new HashSet<>();
                }

                uEdges.add(v);
                nodesMap.put(u, uEdges);
                Set<Integer> vEdges = nodesMap.get(v);

                if (vEdges == null) {
                    vEdges = new HashSet<>();
                }

                vEdges.add(u);
                nodesMap.put(v, vEdges);
            }
            for (int nodeId : nodesMap.get(1)) {
                nodesMap.get(nodeId).remove(1);
                createEdge(rootNode, nodeId);
            }
        }
        return rootNode;
    }

    private void createEdge(Tree parent, int nodeId) {
        Set<Integer> nodeEdges = nodesMap.get(nodeId);
        boolean hasChild = nodeEdges != null && !nodeEdges.isEmpty();
        if (hasChild) {
            TreeNode node = new TreeNode(values[nodeId - 1], colors[nodeId - 1], parent.getDepth() + 1);
            ((TreeNode) parent).addChild(node);

            for (int neighborId : nodeEdges) {
                nodesMap.get(neighborId).remove(nodeId);
                createEdge(node, neighborId);
            }
        } else {
            TreeLeaf leaf = new TreeLeaf(values[nodeId - 1], colors[nodeId - 1], parent.getDepth() + 1);
            ((TreeNode) parent).addChild(leaf);
        }
    }
}
