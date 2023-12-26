def bubble_sort(unsorted_list):
    for sorted_index in range(len(unsorted_list)):
        for element_index in range(len(unsorted_list) - 1 - 1):
            if unsorted_list[element_index] > unsorted_list[element_index + 1]:
                unsorted_list[element_index], unsorted_list[element_index + 1] = unsorted_list[element_index + 1], unsorted_list[element_index]
    return unsorted_list


print(bubble_sort([20, -15, 7, 35, 1, -22, 55, -343, 243, -23, 999]))
