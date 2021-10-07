class methods_refactored {
    @java.lang.Override
    public java.lang.String toString() {
        return "Methods{" +
                "Name=" + name +
                ", Surname=" + b +
                ", address='" + a + '\'' +
                '}';
    }

    public int getSurname() {
        return name;
    }

    public void setSurname(int yourName) {
        this.name = yourName;
    }

}