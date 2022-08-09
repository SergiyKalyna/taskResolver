class MyRegex {
    MyRegex(String ip) {
        if (checkInputIp(ip)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public boolean checkInputIp(String ip) {
        String A = ip.substring(0, ip.indexOf("."));
        ip = ip.substring(ip.indexOf(".") + 1);
        String B = ip.substring(0, ip.indexOf("."));
        ip = ip.substring(ip.indexOf(".") + 1);
        String C = ip.substring(0, ip.indexOf("."));
        ip = ip.substring(ip.indexOf(".") + 1, ip.length());
        String D = ip;

        if (checkValidChapterIp(A) && checkValidChapterIp(B) && checkValidChapterIp(C) && checkValidChapterIp(D)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkValidChapterIp(String chapterId) {
        int id = 0;
        if (chapterId.startsWith("0")) {
            if (chapterId.startsWith("00")) {
                id = Integer.parseInt(chapterId.substring(2, chapterId.length()));
            } else {
                id = Integer.parseInt(chapterId.substring(1, chapterId.length()));
            }
        } else {
            id = Integer.parseInt(chapterId);
        }
        if (chapterId.length() < 4 && chapterId.length() > 0 && id >= 0 && id <= 255) {
            return true;
        } else {
            return false;
        }
    }
}
