from abc import ABC, abstractmethod
class AbstractController(ABC):
    @abstractmethod
    def loadProducts(self):
        pass