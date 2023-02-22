# import everything from tkinter module
from tkinter import *
  
# import messagebox from tkinter module
import tkinter.messagebox
  
# create a tkinter root window
root = tkinter.Tk()
  
# root window title and dimension
root.title("When you press a button the message will pop up")
root.geometry('500x300')
  
# Create a messagebox showinfo
  
def onClick():
    tkinter.messagebox.showinfo("Welcome to GFG.",  "Hi I'm harisai @MR.IMMORTAL")
  
# Create a Button
button = Button(root, text="Click Me", command=onClick, height=5, width=10)
  
# Set the position of button on the top of window.
button.pack(side='bottom')
root.mainloop()
