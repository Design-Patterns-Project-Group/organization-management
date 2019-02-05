from abc import ABC, abstractmethod
class AbstractView(ABC):
    @abstractmethod
    def initialise(self):
        pass
    @abstractmethod
    def showProducts(self, products):
        pass