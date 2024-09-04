class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0, d = 0;
        int maxDist = 0;

        for (int command : commands) {
            if (command == -2) {
                d = (d + 3) % 4;
            } else if (command == -1) {
                d = (d + 1) % 4;
            } else {
                for (int i = 0; i < command; i++) {
                    int newX = x + directions[d][0];
                    int newY = y + directions[d][1];
                    if (!obstacleSet.contains(newX + "," + newY)) {
                        x = newX;
                        y = newY;
                        maxDist = Math.max(maxDist, x * x + y * y);
                    }
                }
            }
        }
        return maxDist;
    }
}