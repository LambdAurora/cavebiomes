package supercoder79.cavebiomes.util;

import java.util.Random;

public class LayerRandom extends Random {

    private long worldSeed;

    public LayerRandom(long worldSeed) {
        this.worldSeed = worldSeed;
    }

    public void setPosSeed(int x, int z) {
        this.setSeed(worldSeed);
        long a = this.nextLong();
        long b = this.nextLong();
        long c = this.nextLong();
        setSeed((a * x * x * x + b * z * z + (3247247284723L) * c) ^ worldSeed);
    }

    //Thanks, KaptainWutax :D
    public void setPosSeed(int x, int z, int index) {
        this.setSeed(worldSeed);
        long a = this.nextLong();
        long b = this.nextLong();
        long c = this.nextLong();
        setSeed((a * x * x * x + b * z * z + (index + 1) * c) ^ worldSeed);
    }
}
