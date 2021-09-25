import java.util.*;

public class GridSearchSolution
{

    public static String gridSearch(List<String> G, List<String> P) {
        if (P.size() == 0 || G.size() == 0)
        {
            return "NO";
        }

        if (P.size() > G.size())
        {
            return "NO";
        }
        int patternWidth = P.get(0).length();
        int patternHeight = P.size();

        int gridWidth = P.get(0).length();
        int gridHeight = P.size();

        int currentWidthStart = 0;
        int currentHeightStart = 0;
        while(currentHeightStart + patternHeight < G.size())
        {

            List<String> currentFrame = getFrameFromGrid(G, P, currentWidthStart, currentHeightStart);
            System.out.println(currentFrame + "\n\n");
            if (framesMatch(currentFrame, P))
            {
                return "YES";
            }
            if(currentWidthStart + patternWidth <  gridWidth)
            {
                currentWidthStart++;
            }
            else
            {
                currentWidthStart = 0;
                currentHeightStart++;
            }
        }

        return "NO";
    }

    public static List<String> getFrameFromGrid(List<String> G, List<String> P,
                                                int widthStart, int heightStart)
    {
        int heightSize = G.size();
        int widthSize = G.get(0).length();

        int patternHeight = P.size();
        int patternWidth = P.get(0).length();

        List<String> frame = new ArrayList<>();
        for(int i = heightStart; i < patternHeight; i++)
        {
            frame.add(G.get(i).substring(widthStart, patternWidth));
        }
        return frame;
    }

    public static boolean framesMatch(List<String> frame1, List<String> frame2)
    {

        if (frame1.size() != frame2.size())
        {
            return false;
        }
        for (int i = 0; i < frame1.size(); i++)
        {
            if (frame1.get(i) != frame2.get(i))
            {
                return false;
            }
        }
        return true;
    }

}
