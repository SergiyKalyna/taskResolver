public class FancyVisitor extends TreeVis {
    int even = 0;
    int green = 0;

    public int getResult() {
        return Math.abs(even - green);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            even += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            green += leaf.getValue();
        }
    }
}
