class Methods {
    int a = 0;
    int b = 0;
    boolean c = true;
    String name;

    public Methods() {
    }

    public static void main(String[] args) {
        // TO DO
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Methods methods = (Methods) object;
        return a == methods.a && b == methods.b && c == methods.c && java.util.Objects.equals(name, methods.name);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b, c, name);
    }

    public void methodOne() {
        System.out.println();
    }

    public void methodTwo() {
        System.out.println();
    }

    public void methodThree() {
        System.out.println();
    }
}