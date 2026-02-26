#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = nullptr;
    }
};

class BST {
private:
    Node* root;

    // Recursive insert
    Node* insert(Node* node, int val) {
        if (node == nullptr)
            return new Node(val);

        if (val < node->data)
            node->left = insert(node->left, val);
        else if (val > node->data)
            node->right = insert(node->right, val);

        return node;
    }

    // Recursive search
    bool search(Node* node, int key) {
        if (node == nullptr)
            return false;
        if (node->data == key)
            return true;
        if (key < node->data)
            return search(node->left, key);
        return search(node->right, key);
    }

    // Height
    int height(Node* node) {
        if (node == nullptr)
            return 0;
        return 1 + max(height(node->left), height(node->right));
    }

    // Mirror image
    void mirror(Node* node) {
        if (node == nullptr)
            return;
        swap(node->left, node->right);
        mirror(node->left);
        mirror(node->right);
    }

    // Inorder traversal
    void inorder(Node* node) {
        if (node != nullptr) {
            inorder(node->left);
            cout << node->data << " ";
            inorder(node->right);
        }
    }

public:
    BST() {
        root = nullptr;
    }

    // Normal insert
    void insert(int val) {
        root = insert(root, val);
    }

    // Operator overloading for insertion
    BST& operator<<(int val) {
        insert(val);
        return *this;
    }

    void display() {
        cout << "Inorder Traversal: ";
        inorder(root);
        cout << endl;
    }

    void mirror() {
        mirror(root);
        cout << "Mirror image created\n";
    }

    void height() {
        cout << "Height = " << height(root) << endl;
    }

    void search(int key) {
        if (search(root, key))
            cout << "Found\n";
        else
            cout << "Not Found\n";
    }
};

int main() {
    BST tree;
    int n, val, key;

    cout << "Enter number of nodes: ";
    cin >> n;

    cout << "Enter values: ";
    for (int i = 0; i < n; i++) {
        cin >> val;
        tree << val;   // operator overloading used
    }

    tree.display();
    tree.height();

    cout << "Enter value to search: ";
    cin >> key;
    tree.search(key);

    tree.mirror();
    tree.display();

    return 0;
}
