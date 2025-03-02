//<a href="https://leetcode.com/problems/find-center-of-star-graph/">1791. Find Center of Star Graph</a>
//Runtime: 422ms, beats: 100.00; Memory: 25.02MB, beats: 57.14%

class A1791CenterOfStarGraph {
	func findCenter(_ edges: [[Int]]) -> Int {
		let edge = edges[0]
		return edge[0] == edges[1][0] || edge[0] == edges[1][1] ? edge[0] : edge[1]
	}
}