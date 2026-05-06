class Solution:
    def findMinHeightTrees(self, n: int, edges: List[List[int]]) -> List[int]:
        graph = [[] for _ in range(n)]
        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)
            
        def height(node, parent, graph):
            h = 0
            for nei in graph[node]:
                if nei!=parent:
                    h = max(h,1 + height(nei,node,graph))
            return h
            
        heights=[]
        for root in range(n):
            heights.append(height(root,-1,graph))
            
        min_height = min(heights) 
            
        roots = [i for i, h in enumerate(heights) if h == min_height]
            
        return roots
            