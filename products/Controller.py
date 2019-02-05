from .AbstractController import AbstractController
class Controller(AbstractController):
    def __init__(self, productRepo):
        self.productRepo = productRepo
    def loadProducts(self):
        return self.productRepo.getProducts()
