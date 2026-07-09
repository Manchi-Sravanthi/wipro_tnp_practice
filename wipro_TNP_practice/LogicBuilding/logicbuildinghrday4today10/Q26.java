package logicbuildinghrday4today10;

public class Q26 {
	public static int totalHillWeight(int input1, int input2, int input3)
    {
        int total = 0;
        int weight = input2;

        for(int level = 1; level <= input1; level++)
        {
            total += level * weight;
            weight += input3;
        }

        return total;
    }

    public static void main(String[] args)
    {
        System.out.println(totalHillWeight(5, 10, 2));
    }
}
