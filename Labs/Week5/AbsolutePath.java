package Week5;

public class AbsolutePath {
    static String currentDir = System.getProperty("user.dir");

    public static String ensureAbsolute(String path){
        if(path.startsWith("/")){
            return path;
        }
        return currentDir + "/" + path;
    }

    public static String[] absoluteSplitPath(String s){
        String [] path = SplitPathName.splitPath(s);
        path[0] = ensureAbsolute(SplitPathName.splitPath(s)[0]);
        return path;
    }

    public static void main(String[] args) {
    }
}
