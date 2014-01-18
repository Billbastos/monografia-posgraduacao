(ns calculofatorial.core
  (:gen-class))

(defn -main
  [args]

  (def tempoInicial (double (. System (nanoTime))))

  (defn factorial [f n]
    (if (= n 1)
      f
      (factorial (* f n) (dec n))))

  (def resultado (factorial 1N 50N))

  (def tempoFinal (double (. System (nanoTime))))

  (println (format "Resultado: %d" (biginteger resultado)))
  (println (format "Tempo (ms): %.6f" (/ (- tempoFinal tempoInicial) 1000000))))
