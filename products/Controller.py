from .AbstractController import AbstractController
class Controller(AbstractController):
    def __init__(self, productRepo, view):
        self.productRepo = productRepo
        self.view = view
    def loadProducts(self):
        result = self.productRepo.getProducts()
        self.view.showProducts(result)