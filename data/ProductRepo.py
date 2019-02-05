from abc import ABC, abstractmethod
class ProductRepo(ABC):
    @abstractmethod
    def getProductById(self, id):
        pass
    @abstractmethod
    def insertProduct(self, product):
        pass
    @abstractmethod
    def deleteProduct(self, product):
        pass
    @abstractmethod
    def getProducts(self):
        pass
