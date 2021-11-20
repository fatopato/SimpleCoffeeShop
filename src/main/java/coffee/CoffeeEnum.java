package coffee;

public enum CoffeeEnum {
    DEFAULT {
        @Override
        public Coffee getCoffee() {
            return null;
        }
    },
    ESPRESSO {
        @Override
        public Coffee getCoffee() {
            return new EspressoCoffee();
        }
    },
    DOUBLE_ESPRESSO {
        @Override
        public Coffee getCoffee() {
            return new DoubleEspressoCoffee();
        }
    },
    CAPPUCCINO {
        @Override
        public Coffee getCoffee() {
            return new CappuccinoCoffee();
        }
    },
    CAFFE_LATTE {
        @Override
        public Coffee getCoffee() {
            return new CaffeLatteCoffee();
        }
    },
    MOCHA {
        @Override
        public Coffee getCoffee() {
            return new MochaCoffee();
        }
    },
    AMERICANO {
        @Override
        public Coffee getCoffee() {
            return new AmericanoCoffee();
        }
    },
    HOT_WATER {
        @Override
        public Coffee getCoffee() {
            return new HotWaterCoffee();
        }
    };

    public abstract Coffee getCoffee();
}
