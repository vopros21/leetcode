//<a href="https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/">1233. Remove Sub-Folders from the Filesystem</a>
//Runtime: 31ms, beats: 100.00; Memory: 27.14MB, beats: 60.00%

class Solution {
    func removeSubfolders(_ folder: [String]) -> [String] {
        var ar = folder.sorted()
        var res = [String]()
        for s in ar {
            guard let f = res.last else { 
                res.append(s)
                continue }
            if f == s {
                continue
            }
            if s.hasPrefix("\(f)/") { continue }
            res.append(s)
        }
        return res
    }
}