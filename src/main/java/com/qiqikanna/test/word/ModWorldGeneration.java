package com.qiqikanna.test.word;

import com.qiqikanna.test.word.flower.ModFlowerGeneration;
import com.qiqikanna.test.word.ore.ModOreGeneration;
import com.qiqikanna.test.word.tree.ModTreeGeneration;

public class ModWorldGeneration
{
    public static void register()
    {
        ModTreeGeneration.registerTrees();
        ModFlowerGeneration.registerFlowers();
        ModOreGeneration.rgisterOre();
    }
}
