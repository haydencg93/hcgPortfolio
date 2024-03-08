def integerSum():
    numbers = []
    while True:
        try:
            inputNumber = input()
            if inputNumber == 'sum':
                break
            if inputNumber.isdigit():
                numbers.append(int(inputNumber))
            else:
                print('Invalid input.')
                return
        except ValueError:
            print('Invalid input.')
            return
    print(sum(numbers))

if __name__ == '__main__':
    integerSum()