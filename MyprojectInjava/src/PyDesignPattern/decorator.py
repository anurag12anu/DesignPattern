def make_bold(func):
    def wrapper():
        return f"<b>{func()}</b>"
    return wrapper

def make_italic(func):
    def wrapper():
        return f"<i>{func()}</i>"
    return wrapper

@make_bold
@make_italic
def greet():
    return "Hello"

# Usage
print(greet())  # <b><i>Hello</i></b>
