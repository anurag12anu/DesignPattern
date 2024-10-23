class Command:
    def execute(self):
        pass

class LightOnCommand(Command):
    def __init__(self, light):
        self.light = light

    def execute(self):
        self.light.on()

class Light:
    def on(self):
        print("Light is on")

# Usage
light = Light()
command = LightOnCommand(light)
command.execute()  # Light is on
