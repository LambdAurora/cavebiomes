package supercoder79.cavebiomes.layer;

import supercoder79.cavebiomes.CaveBiomes;
import supercoder79.cavebiomes.cave.CaveDecorators;
import supercoder79.cavebiomes.magic.LayerRandom;

public class RareCaveLayer extends CaveLayer {
    @Override
    public int operate(LayerRandom random, int parent, int x, int z) {
        random.setPosSeed(x, z, 3);
        if (parent == -2) { //stone layer marker
            int i = random.nextInt(3);
            if (i == 0) return CaveBiomes.CONFIG.generateFullObsidianCaves ? LayerHolder.MASTER_DECORATOR_LIST.indexOf(CaveDecorators.FULL_OBSIDIAN) : LayerHolder.MASTER_DECORATOR_LIST.indexOf(CaveDecorators.OBSIDIAN);
            if (i == 1) return LayerHolder.MASTER_DECORATOR_LIST.indexOf(CaveDecorators.MUSHROOM);
            return LayerHolder.MASTER_DECORATOR_LIST.indexOf(CaveDecorators.COBWEB);
        }

        return parent;
    }
}
