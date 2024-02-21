#include <unordered_map>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> numMap;
        vector<int> result;
        for (int i = 0;i < nums.size(); ++i){
            int complement = target - nums[i];
            if (numMap.find(complement) != numMap.end()){
                result.push_back(numMap[complement]);
                result.push_back(i);
                return result;
            }
            numMap[nums[i]] = i;
        }
        result.push_back(-1);
        result.push_back(-1);
        return result;
    }
};