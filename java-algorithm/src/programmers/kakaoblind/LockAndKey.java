package programmers.kakaoblind;

public class LockAndKey {
    private static final int ROTATE_COUNT = 4;

    public boolean solution(int[][] key, int[][] lock) {
        int keyLength = key.length;
        int lockLength = lock.length;
        int bigLockLength = (keyLength - 1) * 2 + lockLength;

        int lockStartIndex = keyLength - 1;
        int lockEndIndex = lockStartIndex + lockLength;

        int[][] bigLock = new int[bigLockLength][bigLockLength];

        for (int i = 0; i < ROTATE_COUNT; i++) {
            rotateLock(lock);
            for (int y = 0; y < lockEndIndex; y++) {
                for (int x = 0; x < lockEndIndex; x++) {
                    initializeBigLock(lock, lockStartIndex, lockEndIndex, bigLock);
                    if (check(lockStartIndex, lockEndIndex, bigLock, key, x, y)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private void rotateLock(int[][] lock) {
        int lockLength = lock.length;
        int[][] newLock = new int[lockLength][lockLength];

        for (int i = 0; i < lockLength; i++) {
            for (int j = 0; j < lockLength; j++) {
                newLock[i][j] = lock[j][lockLength - i - 1];
            }
        }

        System.arraycopy(newLock, 0, lock, 0, lockLength);
    }

    private void initializeBigLock(int[][] lock, int lockStartIndex, int lockEndIndex, int[][] bigLock) {
        for (int i = lockStartIndex; i < lockEndIndex; i++) {
            System.arraycopy(lock[i - lockStartIndex], 0, bigLock[i], lockStartIndex, lockEndIndex - lockStartIndex);
        }
    }

    private boolean check(int lockStartIndex, int lockEndIndex, int[][] bigLock, int[][] key, int x, int y) {
        for (int i = x; i < x + key.length; i++) {
            for (int j = y; j < y + key.length; j++) {
                bigLock[i][j] += key[i - x][j - y];
            }
        }

        for (int i = lockStartIndex; i < lockEndIndex; i++) {
            for (int j = lockStartIndex; j < lockEndIndex; j++) {
                if (bigLock[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
