class Car:
    def __init__(self):
        self.wheels = None
        self.color = None

class CarBuilder:
    def __init__(self):
        self.car = Car()

    def set_wheels(self, wheels):
        self.car.wheels = wheels
        return self

    def set_color(self, color):
        self.car.color = color
        return self

    def build(self):
        return self.car

# Usage
builder = CarBuilder()
car = builder.set_wheels(4).set_color("red").build()
print(f"Car with {car.wheels} wheels and {car.color} color")
