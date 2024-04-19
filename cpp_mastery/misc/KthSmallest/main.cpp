#include <iostream>
#include <vector>

int kthSmallestElement(const std::vector<int>& nums1, const std::vector<int>& nums2, const std::vector<int>& nums3, int k) {
    int i = 0, j = 0, l = 0;
    int count = 0;
    int result = 0;

    while (count < k && i < nums1.size() && j < nums2.size() && l < nums3.size()) {
        if (nums1[i] <= nums2[j] && nums1[i] <= nums3[l]) {
            result = nums1[i];
            i++;
        } else if (nums2[j] <= nums1[i] && nums2[j] <= nums3[l]) {
            result = nums2[j];
            j++;
        } else {
            result = nums3[l];
            l++;
        }
        count++;
    }

    // Handle the case when k is larger than the total number of elements in all lists
    while (count < k && i < nums1.size()) {
        result = nums1[i];
        i++;
        count++;
    }

    while (count < k && j < nums2.size()) {
        result = nums2[j];
        j++;
        count++;
    }

    while (count < k && l < nums3.size()) {
        result = nums3[l];
        l++;
        count++;
    }

    return result;
}

int main() {
    std::vector<int> nums1 = {1, 3, 5, 7, 9};
    std::vector<int> nums2 = {2, 4, 6, 8, 10};
    std::vector<int> nums3 = {11, 12, 13, 14, 15};
    int k = 8; // Find the 8th smallest element

    int kth_smallest = kthSmallestElement(nums1, nums2, nums3, k);
    std::cout << "The " << k << "th smallest element is: " << kth_smallest << std::endl;

    return 0;
}

