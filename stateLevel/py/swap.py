def swap():
    num1 = input()
    num2 = input()
    temp = ""
    temp = num1
    num1 = num2
    num2 = temp
    print("swapped num1 is " + num1 + " and swapped num2 is " + num2 + ".")

if __name__ == '__main__':
    swap()