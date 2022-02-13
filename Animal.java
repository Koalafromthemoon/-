public interface Animal {
    public void eat();

    default void bark() {
        System.out.println("ГАВ!");
    }
}
