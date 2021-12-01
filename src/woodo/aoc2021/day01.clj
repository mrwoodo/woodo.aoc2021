(ns woodo.aoc2021.day01)
(require 'clojure.java.io)

(def input
  (map read-string
       (clojure.string/split-lines
         (slurp "C:\\Users\\Chris\\IdeaProjects\\woodo.aoc2021\\Day01.txt"))))

(defn compareDepth [measurement]
  (println
    (count
      (filter
        (fn [[a b]]
          (if (< a b) [a b]))
        (partition 2 1 measurement))))
  )

(print "Day 01 Part 1: ")
(compareDepth input)

(print "Day 01 Part 2: ")
(compareDepth
  (map
    (fn [[a b c]]
      (+ a b c))
    (partition 3 1 input)))