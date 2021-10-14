import unittest
from LCA import *

class TestStringMethods(unittest.TestCase):


    def test_findlca(self):
        #test for empty tree
        root = None;
        self.assertEqual(findLCA(None, 1, 2), -1)

        #test for tree with 2 elem
        root = Node(1)
        root.left = Node(2)
        self.assertEqual(findLCA(None, 1, 2), -1)

        #test for others
        root.left.left = Node(4)
        root.left.right = Node(5)
        root.right = Node(3)
        root.right.left = Node(6)
        root.right.right = Node(7)
        self.assertEqual(findLCA(root, 4, 5), 2)

if __name__ == '__main__':
    unittest.main()