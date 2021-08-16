package supercoder79.cavebiomes.world.layer.cave;

import supercoder79.cavebiomes.api.CaveBiomesAPI;
import supercoder79.cavebiomes.util.LayerRandom;
import supercoder79.cavebiomes.world.decorator.CaveDecorators;
import supercoder79.cavebiomes.world.layer.SamplingCaveLayer;

public class StoneCaveLayer extends SamplingCaveLayer {
    public StoneCaveLayer(long worldSeed, int salt) {
        super(worldSeed, salt);
    }

    @Override
    protected int operate(LayerRandom random, int x, int z, int sample) {
        if (random.nextInt(5) == 0) {
            int i = random.nextInt(4);
            if (i == 0) return CaveBiomesAPI.indexOf(CaveDecorators.ANDESITE);
            if (i == 1) return CaveBiomesAPI.indexOf(CaveDecorators.GRANITE);
            if (i == 2) return CaveBiomesAPI.indexOf(CaveDecorators.DIORITE);
            else return CaveBiomesAPI.indexOf(CaveDecorators.TUFF);
        }

        return sample;
    }
}
