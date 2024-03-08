def calculate_slope(point1, point2):
    try:
        x1, y1 = point1
        x2, y2 = point2
        if x1 == x2:
            raise ValueError("Unable to calculate slope.")
        slope = (y2 - y1) / (x2 - x1)
        return round(slope, 1)
    except ValueError as e:
        return str(e)

def get_input():
    point1 = input().split(',')
    point2 = input().split(',')
    return [float(point1[0]), float(point1[1])], [float(point2[0]), float(point2[1])]

def main():
    point1, point2 = get_input()
    slope = calculate_slope(point1, point2)
    print(slope)

if __name__ == "__main__":
    main()