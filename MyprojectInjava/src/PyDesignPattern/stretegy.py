class Strategy:
    def execute(self, a, b):
        pass

class AddStrategy(Strategy):
    def execute(self, a, b):
        return a + b

class MultiplyStrategy(Strategy):
    def execute(self, a, b):
        return a * b

class Context:
    def __init__(self, strategy: Strategy):
        self.strategy = strategy

    def execute_strategy(self, a, b):
        return self.strategy.execute(a, b)

# Usage
context = Context(AddStrategy())
print(context.execute_strategy(3, 4))  # 7

context = Context(MultiplyStrategy())
print(context.execute_strategy(3, 4))  # 12
