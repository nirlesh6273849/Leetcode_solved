class Solution:
    def minimumEffort(self, tasks: List[List[int]]) -> int:
        l=sorted(tasks,key=lambda x:x[1]-x[0])
        m=0
        for i in l:
            m=max(i[1],i[0]+m)
        return m
