package Week5;

public class SplitPathName
{
    /*
     * [0] - directory
     * [1] - filename
     * [2] - filename-base
     * [3]  -filename-extension
     */
    public static String[] splitPath(String s)
    {
        String[] splittedPath = new String[4];

        int lastSlash = s.lastIndexOf("/");

        if (lastSlash == -1)
        {
            splittedPath[0] = "";
            splittedPath[1] = s;
        }
        else {
            splittedPath[0] = s.substring(0, lastSlash +1);
            splittedPath[1] = s.substring(lastSlash + 1, s.length());
        }

        int firstDot = splittedPath[1].indexOf('.');
        if( firstDot == -1){
            splittedPath[2] = splittedPath[1];
            splittedPath[3] = "";
        }
        else
        {
            splittedPath[2] = splittedPath[1].substring(0,firstDot);
            splittedPath[3] = splittedPath[1].substring(firstDot,splittedPath[1].length());
        }
        return splittedPath;
    }

    public static void main(String[] args)
    {
        for (String arg : args)
        {
            String[] comments = splitPath(arg);
            System.out.println("File: " + comments[1] + " Type: " + comments[3] + " [" + comments[0] + "]");
        }
    }
}
