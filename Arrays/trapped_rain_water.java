package Arrays;

import Basic.pattern2.solid_rhombus;

public class trapped_rain_water {
    public static int total_trapped_rain_water(int height[]) {
        // left-max boundry
        int leftMax[] = new int[height.length];

        leftMax[0] = height[0];

        for (int i = 1; i <= height.length - 1; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // right-max boundry
        int rightMax[] = new int[height.length];

        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i <= height.length - 1; i++) {
            // waterLevel = min(left-max boundry, right-max boundry)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        System.out.println(trappedWater);
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // T.C :- O(n)
        total_trapped_rain_water(height);
    }
}
