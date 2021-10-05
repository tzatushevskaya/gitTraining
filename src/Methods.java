class Methods {
    int a = 0;
    int b = 0;
    boolean c = true;
    String name;

    public Methods() {
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

    @java.lang.Override
    public java.lang.String toString() {
        return "Methods{" +
                "Name=" + name +
                ", Surname=" + b +
                ", Nickname=" + c +
                ", address='" + a + '\'' +
                '}';
    }

    public int getAname() {
        return name;
    }

    public void setAname(int yourName) {
        this.name = yourName;
    }

    public static void main(String[] args) {
        // TO DO
    }

    public void methodOne () {
        System.out.println();
    }

    public void methodTwo () {
        System.out.println();
    }

    public void methodThree () {
        System.out.println();
    }

}