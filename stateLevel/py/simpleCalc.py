def simpleCalculator():
    # numInput1 = input()
    # operatorInput = input()
    # numInput2 = input()
    # if operatorInput == "+":
    #     print(float(numInput1) + float(numInput2))
    # elif operatorInput == "-":
    #     print(float(numInput1) - float(numInput2))
    # elif operatorInput == "*":
    #     print(float(numInput1) * float(numInput2))
    # elif operatorInput == "/":
    #     print(float(numInput1) / float(numInput2))

    ##################################################################
    
    eqInput = input()
    for i in range(len(eqInput)):
        # print(eqInput[i])
        if eqInput[i] == '+':
            print(float(eqInput[:i]) + float(eqInput[i+1]))
        elif eqInput[i] == '-':
            print(float(eqInput[:i]) - float(eqInput[i+1]))
        elif eqInput[i] == '*':
            print(float(eqInput[:i]) * float(eqInput[i+1]))
        elif eqInput[i] == '/':
            print(float(eqInput[:i]) / float(eqInput[i+1]))
        else:
            continue

if __name__ == '__main__':
    simpleCalculator()