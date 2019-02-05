from .AbstractView import AbstractView
from .Controller import Controller
class View(AbstractView):
    def __init__(self, productRepo):
        self.productRepo = productRepo
        self.controller = Controller(self.productRepo, self)
        self.initialise()
    def initialise(self):
        print("\nList of products\n")
        self.controller.loadProducts()
    def showProducts(self, products):
        for product in products:
            print('\n',product.name,'\n')
