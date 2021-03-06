package net.journey.util.handler;

import net.minecraft.util.IStringSerializable;

public class EnumTypeHandler {
    public enum EnumType implements IStringSerializable {
        BRISON_STONE(0, "brisonstone"),
        DARK_BRISON_BRICK(1, "darkbrisonbrick"),
        RED_BRISON_BRICK(2, "redbrisonbrick"),
        SMALL_BRISON_BRICK(3, "smallbrisonbrick");

        private static final EnumType[] META_LOOKUP = new EnumType[values().length];

        static {
            for (EnumType enumtype : values()) {
                META_LOOKUP[enumtype.getMeta()] = enumtype;
            }
        }

        private final int meta;
        private final String name, unlocializedName;

        EnumType(int meta, String name) {
            this(meta, name, name);
        }

        EnumType(int meta, String name, String unlocializedName) {
            this.meta = meta;
            this.name = name;
            this.unlocializedName = unlocializedName;
        }

        public static EnumType byMetadata(int meta) {
            return META_LOOKUP[meta];
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int getMeta() {
            return this.meta;
        }

        public String getUnlocializedName() {
            return this.unlocializedName;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}