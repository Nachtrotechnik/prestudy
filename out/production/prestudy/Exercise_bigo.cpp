#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <functional>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'aVeryBigSum' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 */

long aVeryBigSum(vector<long> ar) {
    long sum = 0;
    for (int i = 0; i < ar.size(); i++) {
        sum += ar[i];
    }
    return sum;
}

int main()
{
    // Test the function with sample inputs
    cout << "Testing A Very Big Sum function..." << endl;
    
    // Test Case 1: Normal array
    vector<long> test1;
    test1.push_back(1); test1.push_back(2); test1.push_back(3); test1.push_back(4); test1.push_back(5);
    cout << "Test 1: [1, 2, 3, 4, 5]" << endl;
    cout << "Expected: 15, Got: " << aVeryBigSum(test1) << endl;
    
    // Test Case 2: Large numbers (the "very big" part)
    vector<long> test2;
    test2.push_back(1000000001); test2.push_back(1000000002); test2.push_back(1000000003); 
    test2.push_back(1000000004); test2.push_back(1000000005);
    cout << "Test 2: [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]" << endl;
    cout << "Expected: 5000000015, Got: " << aVeryBigSum(test2) << endl;
    
    // Test Case 3: Single element
    vector<long> test3;
    test3.push_back(42);
    cout << "Test 3: [42]" << endl;
    cout << "Expected: 42, Got: " << aVeryBigSum(test3) << endl;
    
    // Test Case 4: Empty array
    vector<long> test4;
    cout << "Test 4: []" << endl;
    cout << "Expected: 0, Got: " << aVeryBigSum(test4) << endl;
    
    // Test Case 5: Two large numbers
    vector<long> test5;
    test5.push_back(999999999999); test5.push_back(1);
    cout << "Test 5: [999999999999, 1]" << endl;
    cout << "Expected: 1000000000000, Got: " << aVeryBigSum(test5) << endl;
    
    cout << "\nAll tests completed!" << endl;
    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}

vector<string> split(const string &str) {
    vector<string> tokens;

    string::size_type start = 0;
    string::size_type end = 0;

    while ((end = str.find(" ", start)) != string::npos) {
        tokens.push_back(str.substr(start, end - start));

        start = end + 1;
    }

    tokens.push_back(str.substr(start));

    return tokens;
}
