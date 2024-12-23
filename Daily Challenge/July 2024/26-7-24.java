// 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance
// There are n cities numbered from 0 to n-1. Given the array edges where edges[i] = [fromi, toi, weighti] represents a bidirectional and weighted edge between cities fromi and toi, and given the integer distanceThreshold.

// Return the city with the smallest number of cities that are reachable through some path and whose distance is at most distanceThreshold, If there are multiple such cities, return the city with the greatest number.

// Notice that the distance of a path connecting cities i and j is equal to the sum of the edges' weights along that path.

import java.util.*;
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int node1 = edge[0], node2 = edge[1], distance = edge[2];
            graph.get(node1).add(new int[]{node2, distance});
            graph.get(node2).add(new int[]{node1, distance});
        }

        int minimum_number = n;
        int res = -1;

        for (int source = 0; source < n; source++) {
            int neighbors = get_number_of_neighbors_in_distance(graph, source, n, distanceThreshold);
            if (neighbors <= minimum_number) {
                minimum_number = neighbors;
                res = source;
            }
        }

        return res;
    }

    private int get_number_of_neighbors_in_distance(List<List<int[]>> graph, int source, int n, int distanceThreshold) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.add(new int[]{0, source}); 
        Set<Integer> visited = new HashSet<>();

        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int distance_to_this_node = top[0], cur_node = top[1];
            if (!visited.contains(cur_node)) {
                visited.add(cur_node);
                for (int[] neighbor : graph.get(cur_node)) {
                    int distance_from_source = distance_to_this_node + neighbor[1];
                    if (distance_from_source <= distanceThreshold) {
                        minHeap.add(new int[]{distance_from_source, neighbor[0]});
                    }
                }
            }
        }
        return visited.size() - 1;
    }
}