from .AbstractView import AbstractView
class View(AbstractView):
    def __init__(self, productRepo, controller):
        self.productRepo = productRepo
        self.controller = controller
    def initialise(self):
        pass
    def showProducts(self, products):
        pass
    
