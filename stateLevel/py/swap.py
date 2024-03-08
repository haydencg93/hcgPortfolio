def swap():
    num1 = input()
    num2 = input()
    num3 = ""
    num3 = num1
    num1 = num2
    num2 = num3
    print("swapped num1 is " + num1 + " and swapped num2 is " + num2 + ".")

if __name__ == '__main__':
    swap()