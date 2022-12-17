public class Repository {
    protected Ticket[] products = new Ticket[0];

    public void addProduct(Ticket product) {
        Ticket[] tmp = new Ticket[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Ticket[] findAll() {
        return products;
    }

    public Ticket findById(int id) {
        for (Ticket product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Ticket[] getAll() {
        return products;
    }

}