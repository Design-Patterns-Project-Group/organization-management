from .ProductRepo import ProductRepo
from .Product import Product
class InMemoryProductRepo(ProductRepo):
    products = []
    def __init__(self):
        pass
    def getProductById(self, id):
        for product in InMemoryProductRepo.products:
            if product.id == id:
                return product
        return None
    def insertProduct(self, product):
        InMemoryProductRepo.products.append(product)
    def deleteProduct(self, product):
        for idx,pdt in enumerate(InMemoryProductRepo.products):
            if pdt.id == product.id:
                del InMemoryProductRepo.products[idx]
                break
    def getProducts(self):
        return InMemoryProductRepo.products