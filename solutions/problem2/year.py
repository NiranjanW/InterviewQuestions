with open("./solutions/problem2/data.txt") as fh:
    data = fh.read()

raw_data = [int(i) for i in data.split("\n")[:-1]]
# raw_data = [int(i) for i in fh.read().strip().split()]
print(raw_data)

searching = True
ans = []

def naive():
    for i in raw_data:
        for j in raw_data:
            if i != j:
                if i + j == 2020:

                    print(i * j)


def smarter():
    seen = set()

    for i in raw_data:
        seen.add(i)
        if 2020 - i in seen:
            print(i * (2020 - i))
            break


def search():
    searching = True
    results = []
    while searching:
        for i in raw_data:
            last_i = raw_data.pop()

            if len(raw_data) < 1:
                break
        for exp in raw_data:
            if exp + last_i == 2020:
                results += [exp, last_i]
                searching = False
                break

    print(results)


if __name__ == "__main__":
    # naive()
    # smarter()
    search()

# while found:
#     for i in raw_data:
#         if i+next(raw_data) == 2020:
#             ans.append(i,next(raw_data))
# print(ans)
