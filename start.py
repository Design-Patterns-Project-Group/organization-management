from data.InMemoryProductRepo import InMemoryProductRepo
from products.Controller import Controller
from data.Product import Product
def main():
    ''' simple test for Controller
    r = InMemoryProductRepo()
    r.insertProduct(Product(1,'name', 34))
    r.insertProduct(Product(2,'name2', 45))
    r.insertProduct(Product(3,'name3', 32))
    c = Controller(r)
    print(c.loadProducts())
    '''
main()
    