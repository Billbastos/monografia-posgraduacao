(ns somarnumeros.core
  (:gen-class))

(defn -main
  [args]

  (def tempoInicial (double (. System (nanoTime))))

  (def resultado (loop [somar (long 0) inicio (long 1)]
    (if (< inicio 1000000) (recur (+ somar inicio) (inc inicio)) somar)))

  (def tempoFinal (double (. System (nanoTime))))

  (println (format "Resultado: %d" resultado))
  (println (format "Tempo (ms): %.6f" (/ (- tempoFinal tempoInicial) 1000000))))
